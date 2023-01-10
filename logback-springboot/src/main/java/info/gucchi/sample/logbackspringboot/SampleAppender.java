package info.gucchi.sample.logbackspringboot;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

public class SampleAppender extends AppenderBase<ILoggingEvent> {

    @Getter
    @Setter
    PatternLayoutEncoder encoder;

    @Override
    protected void append(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getLevel() == Level.DEBUG) {
            return;
        }
        try {
            System.out.write(encoder.encode(iLoggingEvent));
        } catch (IOException e) {
        }
    }
}
