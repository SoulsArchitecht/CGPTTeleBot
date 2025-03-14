package ru.sshibko.chat_gpt_telegram_bot.telegram;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.sshibko.chat_gpt_telegram_bot.config.BotConfig;

@Component
public class ChatGptBot extends TelegramLongPollingBot {

    private final BotConfig botConfig;

    public ChatGptBot(BotConfig botConfig) {
        super(botConfig.getKey());
        this.botConfig = botConfig;
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
        sendMessage.setText("Ugo " + update.getMessage().getFrom().getFirstName());
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return botConfig.getName();
    }
}
