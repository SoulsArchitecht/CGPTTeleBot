package ru.sshibko.chat_gpt_telegram_bot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bot")
@Getter
@Setter
public class BotConfig {

    private String name;

    private String key;

    private String ownerChatId;
}
