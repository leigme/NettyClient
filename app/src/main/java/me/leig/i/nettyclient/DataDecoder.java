package me.leig.i.nettyclient;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * Created by i on 2017/10/13.
 */

public class DataDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext context, ByteBuf buf, List<Object> list) throws Exception {
        if (buf.readableBytes() < 4) {
            return;
        }

        list.add(new UnixData(buf.readInt()));
    }
}
