package com.study.test;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * 客服端模式访问百度
 */
public class TEST1597100200 {

    @Test
    public void httpClientDemo() {
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String request = "GET / HTTP/1.1\n" +
                "Cache-Control: max-age=0\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" +
                "Accept-Language: zh-Hans-CN,zh-Hans;q=0.8,en-US;q=0.6,en;q=0.4,ru;q=0.2\n" +
                "Upgrade-Insecure-Requests: 1\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.19002\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Host: 220.181.38.150\n" +
                "Connection: Keep-Alive\r\n\r\n";
        String result = null;
        try {
            //客服端主动发起连接的方式
            SocketChannel channel = SocketChannel.open();
            //设置为非阻塞模式
            channel.configureBlocking(false);
            //设置连接地址
            channel.connect(new InetSocketAddress("www.baidu.com", 80));
            while (!channel.finishConnect()) {
                // 没连接上,则一直等待
                Thread.yield();
            }
            writeBuffer.put(request.getBytes());
            //重置position为0
            writeBuffer.rewind();
            //未写入任何数据就可能返回，所以需要在循环中调用write
            while (writeBuffer.hasRemaining()) {
                //发送请求数据-向通道写入数据
                channel.write(writeBuffer);
            }

            readBuffer.rewind();
            //读取服务端返回的数据-读取缓存区的数据
            int readNumber = channel.read(readBuffer);
            while (channel.isOpen() && readNumber != -1) {
                // 长连接情况下,需要手动判断数据有没有读取结束 (此处做一个简单的判断: 超过0字节就认为请求结束了)
                if (readBuffer.position() > 0) {
                    break;
                }
            }
            byte[] bytes = new byte[readBuffer.position()];
            readBuffer.flip();
            readBuffer.get(bytes);
            result = new String(bytes);
            System.out.println("收到百度的响应:");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] s = result.split("\r\n");
        for (int i = 0; i < s.length; i++) {
            if (s[i].contains("Server: BWS/1.1")) {
                result = s[i];
                break;
            }
        }
        System.out.println("我的QQ号：1597100200，我的解析到百度服务器server类型是："+result);
    }

}