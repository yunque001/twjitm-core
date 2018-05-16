package com.twjitm.core.common.entity.chat;

import com.twjitm.core.common.annotation.MessageCommandAnntation;
import com.twjitm.core.common.enums.MessageComm;
import com.twjitm.core.common.netstack.entity.AbstractNettyNetProtoBufMessage;
import io.netty.handler.codec.CodecException;

/**
 * 删除聊天消息
 */
@MessageCommandAnntation(messagecmd = MessageComm.DELETE_CHAT_MESSAGE)
public class DeleteChatMessage extends AbstractNettyNetProtoBufMessage {


    public DeleteChatMessage(String json) {
        super(json);
    }

    public void decoderNetJsonMessageBody(String json) {

    }

    public void encodeNetJsonMessageBody(String json) {

    }

    public void release() throws CodecException {

    }

    public void encodeNetProtoBufMessageBody() throws CodecException, Exception {

    }

    public void decoderNetProtoBufMessageBody() throws CodecException, Exception {

    }



}
