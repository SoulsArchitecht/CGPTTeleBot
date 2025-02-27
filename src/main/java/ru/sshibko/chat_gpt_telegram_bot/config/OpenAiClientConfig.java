package ru.sshibko.chat_gpt_telegram_bot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "openai.api")
@Getter
@Setter
public class OpenAiClientConfig {

    private String key;
    private String chatUrl;
    private String chatModel;
    private String chatSystemRole;
    private String transcriptionUrl;
    private String voiceModel;
    private String language;
}
