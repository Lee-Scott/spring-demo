package bootstrap;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import guru.springframework.domain.*;

@Slf4j
@Component
public class Main implements ApplicationListener<ContextRefreshedEvent> {
}
