package com.github.bjlhx15.disruptor.demo.base.example;

import com.lmax.disruptor.EventTranslatorOneArg;

public class LongEventTranslator implements EventTranslatorOneArg<LongEvent, Long> {
    @Override
    public void translateTo(LongEvent event, long sequence, Long arg0) {
        event.setNumber(arg0);
    }
}
