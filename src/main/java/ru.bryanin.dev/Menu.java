package ru.bryanin.dev;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public class Menu {

    public SendMessage level_0_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("1. Каталоги");
        keyboardFirstRow.add("2. Паспорта и руководства");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("3. Сертификаты");
        keyboardSecondRow.add("4. Типовые чертежи и проекты");
        // Третья строчка клавиатуры
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("5. Нормативная документация");
        keyboardThirdRow.add("6. Инструменты для инженеров и проектировщиков");
        // Четвертая строчка клавиатуры
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFourthRow.add("7. Презентации и маркетинговые материалы");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_1_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("1.1. LTV");
        keyboardFirstRow.add("1.2. LPA");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("1.3. ЛКД");
        keyboardSecondRow.add("1.4. ЛПТ");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_1_1_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '1. Каталоги'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_1_2_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '1. Каталоги'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_1_3_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '1. Каталоги'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_1_4_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '1. Каталоги'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.1. LTV");
        keyboardFirstRow.add("2.2. LPA");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.3. ЛКД");
        keyboardSecondRow.add("2.4. ЛПТ");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.1.1. 1 серия LTV");
        keyboardFirstRow.add("2.1.2. 2 серия LTV");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.1.3. 3 серия LTV");
        keyboardSecondRow.add("2.1.4. 5 серия LTV");
        // Третья строчка клавиатуры
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("2.1.5. Е серия LTV");
        keyboardThirdRow.add("2.1.6. Аналог LTV");
        // Четвертая строчка клавиатуры
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFourthRow.add("2.1.7. LTV-BOX");
        keyboardFourthRow.add("2.1.8. Термокожухи LTV");
        // Пятая строчка клавиатуры
        KeyboardRow keyboardFifthRow = new KeyboardRow();
        keyboardFifthRow.add("2.1.9. Мониторы LTV");
        keyboardFifthRow.add("2.1.10. Объективы LTV");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2. Паспорта и руководства'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);
        keyboard.add(keyboardFifthRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_1_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_2_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_3_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_4_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_5_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_6_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_7_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_8_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_9_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_1_10_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.1. LTV'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.2.1. LPA-LX");
        keyboardFirstRow.add("2.2.2. LPA-DUO");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.2.3. LPA-Presta");
        keyboardSecondRow.add("2.2.4. LPA-EVA");
        // Третья строчка клавиатуры
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("2.2.5. LPA-IP");
        keyboardThirdRow.add("2.2.6. LPA-speakers");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2. Паспорта и руководства'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_1_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.2.1.1. Микрофонные консоли LPA-LX");
        keyboardFirstRow.add("2.2.1.2. Основное оборудование LPA-LX");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2. LPA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_1_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.1. LPA-LX'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_1_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.1. LPA-LX'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_2_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.2.2.1. Микрофонные консоли LPA-DUO");
        keyboardFirstRow.add("2.2.2.2. Основное оборудование LPA-DUO");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2. LPA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_2_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.2. LPA-DUO'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_2_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.2. LPA-DUO'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_3_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.2.3.1. LPA-Presta-2");
        keyboardFirstRow.add("2.2.3.2. LPA-Presta-8");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.2.3.3. LPA-Presta-16");
        keyboardSecondRow.add("2.2.3.4. LPA-Presta-BOX");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2. LPA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_3_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.3. LPA-Presta'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_3_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.3. LPA-Presta'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_3_3(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.3. LPA-Presta'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_3_4(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.3. LPA-Presta'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_4_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.2.4.1. Микрофонные консоли LPA-EVA");
        keyboardFirstRow.add("2.2.4.2. Основное оборудование LPA-EVA");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.2.4.3. Усилители LPA-EVA");
        keyboardSecondRow.add("2.2.4.4. Дополнительное оборудование LPA-EVA");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2. LPA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_4_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.4. LPA-EVA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_4_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.4. LPA-EVA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_4_3(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.4. LPA-EVA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_4_4(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.4. LPA-EVA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_5_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.2.5.1. Аудио интерком LPA-IP");
        keyboardFirstRow.add("2.2.5.2. Видео интерком LPA-IP");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.2.5.3. Звукоусиление LPA-IP");
        keyboardSecondRow.add("2.2.5.4. Программное обеспечение LPA-IP");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2. LPA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_5_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.5. LPA-IP'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_5_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.5. LPA-IP'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_5_3(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.5. LPA-IP'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_5_4(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2.5. LPA-IP'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_2_6_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.2. LPA'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("2.3.1. Биометрические контроллеры ЛКД");
        keyboardFirstRow.add("2.3.2. Доводчики ЛКД");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("2.3.3. Домофония ЛКД");
        keyboardSecondRow.add("2.3.4. Замки ЛКД");
        // Третья строчка клавиатуры
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("2.3.5. Идентификаторы ЛКД");
        keyboardThirdRow.add("2.3.6. ИК-извещатели ЛКД");
        // Четвертая строчка клавиатуры
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFourthRow.add("2.3.7. Кнопки выхода ЛКД");
        keyboardFourthRow.add("2.3.8. Контроллеры ЛКД");
        // Пятая строчка клавиатуры
        KeyboardRow keyboardFifthRow = new KeyboardRow();
        keyboardFifthRow.add("2.3.9. Металлодетекторы ЛКД");
        keyboardFifthRow.add("2.3.10. Полуростовые ограждения ЛКД");
        // Шестая строчка клавиатуры
        KeyboardRow keyboardSixthRow = new KeyboardRow();
        keyboardSixthRow.add("2.3.11. Считыватели ЛКД");
        keyboardSixthRow.add("2.3.12. Турникеты и картоприемники ЛКД");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2. Паспорта и руководства'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);
        keyboard.add(keyboardFifthRow);
        keyboard.add(keyboardSixthRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_1_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_2_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_3_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_4_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_5_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_6_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_7_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_8_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_9_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_10_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_11_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_3_12_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2.3. ЛКД'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_2_4_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '2. Паспорта и руководства'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_3_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("4.1. Типовые чертежи");
        keyboardFirstRow.add("4.2. Типовые проекты");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_1_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("4.1.1. LTV");
        keyboardFirstRow.add("4.1.2. LPA");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("4.1.3. ЛКД");
        keyboardSecondRow.add("4.1.4. ЛПТ");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4. Типовые чертежи и проекты'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_1_1_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.1. Типовые чертежи'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_1_2_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.1. Типовые чертежи'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_1_3_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.1. Типовые чертежи'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_1_4_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.1. Типовые чертежи'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("4.2.1. По типу объекта");
        keyboardFirstRow.add("4.2.2. По бренду");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4. Типовые чертежи и проекты'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("4.2.1.1. Медицинские учреждения");
        keyboardFirstRow.add("4.2.1.2. Административные здания");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("4.2.1.3. Спортивные объекты");
        keyboardSecondRow.add("4.2.1.4. Учебные заведения");
        // Третья строчка клавиатуры
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("4.2.1.5. Объекты культуры и отдыха");
        keyboardThirdRow.add("4.2.1.6. Объекты торговли");
        // Четвертая строчка клавиатуры
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFourthRow.add("4.2.1.7. Промышленные объекты");
        keyboardFourthRow.add("4.2.1.8. Жилые здания");
        // Пятая строчка клавиатуры
        KeyboardRow keyboardFifthRow = new KeyboardRow();
        keyboardFifthRow.add("4.2.1.9. Складские и логистические комплексы");
        keyboardFifthRow.add("4.2.1.10. Объекты транспортной инфраструктуры");
       // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2. Типовые проекты'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);
        keyboard.add(keyboardFifthRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_3(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_4(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_5(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_6(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_7(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_8(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_9(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_1_10(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.1. По типу объекта'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_2_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("4.2.2.1. LTV");
        keyboardFirstRow.add("4.2.2.2. LPA");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("4.2.2.3. ЛКД");
        keyboardSecondRow.add("4.2.2.4. ЛПТ");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2. Типовые проекты'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_2_1(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.2. По бренду'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_2_2(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.2. По бренду'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_2_3(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.2. По бренду'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_4_2_2_4(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '4.2.2. По бренду'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_5_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_6_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("6.1. Калькуляторы");
        keyboardFirstRow.add("6.2. BIM-модели (семейства Revit)");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_6_1_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '6.1. Калькуляторы'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_6_2_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '6.2. BIM-модели (семейства Revit)'");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_7_0_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("7.1. LTV");
        keyboardFirstRow.add("7.2. LPA");
        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("7.3. ЛКД");
        keyboardSecondRow.add("7.4. ЛПТ");
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_7_1_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '7.1. Презентации и маркетинговые материалы");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_7_2_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '7.1. Презентации и маркетинговые материалы");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_7_3_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '7.1. Презентации и маркетинговые материалы");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
    public SendMessage level_7_4_0_0(List<KeyboardRow> keyboard, ReplyKeyboardMarkup replyKeyboardMarkup, SendMessage sendMessage, Message message, String text) {
        // Последняя строчка клавиатуры
        KeyboardRow keyboardLastRow = new KeyboardRow();
        keyboardLastRow.add("Назад в меню '7.1. Презентации и маркетинговые материалы");
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardLastRow);
        // и устанавливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        return sendMessage;
    }
}
