package ru.sshibko.chat_gpt_telegram_bot.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class OpenAiClient {


    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
}
