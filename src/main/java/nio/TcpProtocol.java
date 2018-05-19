package nio;

import java.io.IOException;
import java.nio.channels.SelectionKey;

/**
 * @author gongxb
 * @date 2018/5/19
 * @desc
 * @return
 */
public interface TcpProtocol {

    /**
     * 接收一个SocketChannel的处理
     *
     * @param key
     * @throws IOException
     */
    void handleAccept(SelectionKey key) throws IOException;

    /**
     * 从一个SocketChannel读取信息的处理
     *
     * @param key
     * @throws IOException
     */
    void handleRead(SelectionKey key) throws IOException;

    /**
     * 向一个SocketChannel写入信息的处理
     *
     * @param key
     * @throws IOException
     */
    void handleWrite(SelectionKey key) throws IOException;
}
