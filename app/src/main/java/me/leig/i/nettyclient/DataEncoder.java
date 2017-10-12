package me.leig.i.nettyclient;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by i on 2017/10/13.
 */

public class DataEncoder extends MessageToByteEncoder<UnixData> {

    @Override
    protected void encode(ChannelHandlerContext context, UnixData data, ByteBuf buf) throws Exception {
        buf.writeInt(data.getUserId());
    }

}
