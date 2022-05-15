package ru.bryanin.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class BotForEmployees extends TelegramLongPollingBot{

    private final String BOT_NAME = "luis_assistant_bot";
    private final String BOT_TOKEN = "1810970755:AAHLTRWvAQ_JOb6E88qxavVVyskgsVB2H8w";
    private static final Logger logger = LoggerFactory.getLogger(BotForEmployees.class);

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String userFirstName = update.getMessage().getFrom().getFirstName();
        String userLastName = update.getMessage().getFrom().getLastName();
        StringBuilder stringBuilder = new StringBuilder();
        int[] menuLevel = new int[4];
        if (message != null && message.hasText()) {
            switch (message.getText()) {
                //------------------------------------------------------------------------------------------------//
                case "/start":
                    menuLevel[0] = 0;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Добро пожаловать! \n");
                    stringBuilder.append("Перед Вами бот-помощник для поиска технической документации на оборудование LTV, LPA, ЛКД, ЛПТ. \n");
                    stringBuilder.append("Используйте меню для выбора команды");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '/start'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "1. Каталоги":
                    menuLevel[0] = 1;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Чтобы скачать нужный Вам каталог оборудования, выберите соответствующий пункт меню. \n");
                    stringBuilder.append("На текущий момент представлены каталоги на оборудование LTV, LPA, ЛКД, ЛПТ. \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '1. Каталоги'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "1.1. LTV":
                    menuLevel[0] = 1;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать каталог LTV 2022 года можно по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/catalog/ltv2022");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '1.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "1.2. LPA":
                    menuLevel[0] = 1;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать каталог LPA 2022 года можно по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/catalog/lpa2022");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '1.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "1.3. ЛКД":
                    menuLevel[0] = 1;
                    menuLevel[1] = 3;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать каталог ЛКД 2022 года можно по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/catalog/lkd2022");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '1.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "1.4. ЛПТ":
                    menuLevel[0] = 1;
                    menuLevel[1] = 4;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать каталог ЛПТ 2022 года можно по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/catalog/lpt2022");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '1.4. ЛПТ'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '1. Каталоги'":
                    menuLevel[0] = 1;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Чтобы скачать нужный Вам каталог оборудования, выберите соответствующий пункт меню. \n");
                    stringBuilder.append("На текущий момент представлены каталоги на оборудование LTV, LPA, ЛКД, ЛПТ. \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '1. Каталоги'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2. Паспорта и руководства":
                    menuLevel[0] = 2;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LTV, LPA, ЛКД, ЛПТ. \n");
                    stringBuilder.append("Документация расположена в категориях в соответствии с функциональным назначением оборудования\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2. Паспорта и руководства'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1. LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV можно по ссылке: \n");
                    stringBuilder.append("<В РАЗРАБОТКЕ> \n");
                    stringBuilder.append("Также Вы можете выбрать нужную Вам категорию товара в меню ниже: \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.1. 1 серия LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV 1 серии: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.1.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.1. 1 серия LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.2. 2 серия LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV 2 серии: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.2.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.2. 2 серия LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.3. 3 серия LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 3;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV 3 серии: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.3.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.3. 3 серия LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.4. 5 серия LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 4;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV 5 серии: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.4.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.4. 5 серия LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.5. Е серия LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 5;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV Е серии: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.5.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.5. Е серия LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.6. Аналог LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 6;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV серии аналогового видеонаблюдения: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.6.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.6. Аналог LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.7. LTV-BOX":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 7;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV-BOX: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.7.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.7. LTV-BOX'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.8. Термокожухи LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 8;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на термокожухи LTV: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.8.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.8. Термокожухи LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.9. Мониторы LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 9;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на мониторы LTV: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.9.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.9. Мониторы LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.1.10. Объективы LTV":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 10;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на объективы LTV: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.1.10.LTV");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.1.10. Объективы LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.1. LTV'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LTV: \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2. LPA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LPA \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.1. LPA-LX":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-LX можно скачать по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.1.LPA-LX \n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.1. LPA-LX'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.1.1. Микрофонные консоли LPA-LX":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 1;
                    stringBuilder.append("Паспорта и руководства пользователя на микрофонные консоли LPA-LX можно скачать по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.1.1.LPA-LX \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.1.1. Микрофонные консоли LPA-LX'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.1.2. Основное оборудование LPA-LX":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 1;
                    stringBuilder.append("Паспорта и руководства пользователя на микрофонные консоли LPA-LX можно скачать по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.1.2.LPA-LX \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.1.2. Основное оборудование LPA-LX'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.2.1. LPA-LX'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-LX можно скачать по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.1.LPA-LX \n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": 'Назад в меню '2.2.1. LPA-LX'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.2. LPA-DUO":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-DUO можно скачать по ссылке: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.2.LPA-DUO \n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.2. LPA-DUO'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.2.1. Микрофонные консоли LPA-DUO":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 1;
                    stringBuilder.append("Паспорта и руководства пользователя на микрофонные консоли LPA-DUO: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.2.1.LPA-DUO \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.2.1. Микрофонные консоли LPA-DUO'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.2.2. Основное оборудование LPA-DUO":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 2;
                    stringBuilder.append("Паспорта и руководства пользователя на основное оборудование LPA-DUO:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.2.2.LPA-DUO\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.2.2. Основное оборудование LPA-DUO'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.2.2. LPA-DUO'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-DUO: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.2.LPA-DUO\n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.2.2. LPA-DUO'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.3. LPA-Presta":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 3;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-Presta:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.3.LPA-Presta \n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.3. LPA-Presta'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.3.1. LPA-Presta-2":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 3;
                    menuLevel[3] = 1;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-Presta-2:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.3.1.LPA-Presta-2 \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.3.1. LPA-Presta-2'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.3.2. LPA-Presta-8":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 3;
                    menuLevel[3] = 2;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-Presta-8:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.3.2.LPA-Presta-8\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.3.2. LPA-Presta-8'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.3.3. LPA-Presta-16":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 3;
                    menuLevel[3] = 3;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-Presta-16:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.3.3.LPA-Presta-16\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.3.3. LPA-Presta-16'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.3.4. LPA-Presta-BOX":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 3;
                    menuLevel[3] = 4;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-Presta-BOX:\n");
                    stringBuilder.append("<НЕ ПРЕДСТАВЛЕНО ПРОИЗВОДИТЕЛЕМ>\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.3.4. LPA-Presta-BOX'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.2.3. LPA-Presta'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 3;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-Presta:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.3.LPA-Presta");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.2.3. LPA-Presta'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.4. LPA-EVA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 4;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-EVA:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.4.LPA-EVA\n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.4. LPA-EVA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.4.1. Микрофонные консоли LPA-EVA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 4;
                    menuLevel[3] = 1;
                    stringBuilder.append("Паспорта и руководства пользователя на микрофонные консоли LPA-EVA:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.4.1.LPA-EVA\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.4.1. Микрофонные консоли LPA-EVA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.4.2. Основное оборудование LPA-EVA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 4;
                    menuLevel[3] = 2;
                    stringBuilder.append("Паспорта и руководства пользователя на основное оборудование LPA-EVA:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.4.2.LPA-EVA\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.4.2. Основное оборудование LPA-EVA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.4.3. Усилители LPA-EVA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 4;
                    menuLevel[3] = 3;
                    stringBuilder.append("Паспорта и руководства пользователя на усилители LPA-EVA:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.4.3.LPA-EVA\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.4.3. Усилители LPA-EVA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.4.4. Дополнительное оборудование LPA-EVA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 4;
                    menuLevel[3] = 4;
                    stringBuilder.append("Паспорта и руководства пользователя на дополнительное оборудование LPA-EVA:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.4.4.LPA-EVA\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.4.4. Дополнительное оборудование LPA-EVA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.2.4. LPA-EVA'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 4;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-EVA:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.4.LPA-EVA\n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.2.4. LPA-EVA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.5. LPA-IP":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 5;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-IP:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.5.LPA-IP\n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.5. LPA-IP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.5.1. Аудио интерком LPA-IP":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 5;
                    menuLevel[3] = 1;
                    stringBuilder.append("Паспорта и руководства пользователя на аудио интерком LPA-IP:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.5.1.LPA-IP\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.5.1. Аудио интерком LPA-IP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.5.2. Видео интерком LPA-IP":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 5;
                    menuLevel[3] = 2;
                    stringBuilder.append("Паспорта и руководства пользователя на видео интерком LPA-IP:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.5.2.LPA-IP\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.5.2. Видео интерком LPA-IP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.5.3. Звукоусиление LPA-IP":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 5;
                    menuLevel[3] = 3;
                    stringBuilder.append("Паспорта и руководства пользователя на звукоусиление LPA-IP:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.5.3.LPA-IP\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.5.3. Звукоусиление LPA-IP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.5.4. Программное обеспечение LPA-IP":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 5;
                    menuLevel[3] = 4;
                    stringBuilder.append("Паспорта и руководства пользователя на ПО LPA-IP:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.5.4.LPA-IP\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.5.4. Программное обеспечение LPA-IP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.2.5. LPA-IP'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 5;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование LPA-IP:\n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.5.LPA-IP\n");
                    stringBuilder.append("С помощью меню Вы можете выбрать категорию оборудования");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.2.5. LPA-IP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.2.6. Громкоговорители LPA":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 6;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на громкоговорители LPA:");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.2.6.LPA");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.2.6. Громкоговорители LP'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.2. LPA'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование LPA: \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3. ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование ЛКД \n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.1. Биометрические контроллеры ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на биометрические контроллеры ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.1.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.1. Биометрические контроллеры'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.2. Доводчики ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на доводчики ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.2.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.2. Доводчики'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.3. Домофония ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 3;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на домофонию ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.3.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.3. Домофония'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.4. Замки ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 4;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на замки ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.4.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.4. Замки'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.5. Идентификаторы ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 5;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на идентификаторы ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.5.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.5. Идентификаторы'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.6. ИК-извещатели ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 6;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на ИК-извещатели ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.6.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.6. ИК-извещатели'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.7. Кнопки выхода ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 7;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на кнопки выхода ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.7.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.7. Кнопки выхода'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.8. Контроллеры ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 8;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на контроллеры ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.8.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.8. Контроллеры'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.9. Металлодетекторы ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 9;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на металлодетекторы ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.9.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.9. Металлодетекторы'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.10. Полуростовые ограждения ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 10;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на полуростовые ограждения ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.10.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.10. Полуростовые ограждения'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.11. Считыватели ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 11;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на считыватели ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.11.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.11. Считыватели'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.3.12. Турникеты и картоприемники ЛКД":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 12;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на считыватели ЛКД: \n");
                    stringBuilder.append("http://links.bryanin.ru/manuals/2.3.12.LKD");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.3.12. Турникеты и картоприемники'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2.3. ЛКД'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 3;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Скачать паспорта и руководства пользователя на оборудование ЛКД\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "2.4. ЛПТ":
                    menuLevel[0] = 2;
                    menuLevel[1] = 4;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя на оборудование ЛПТ \n");
                    stringBuilder.append("https://luis-lpt.ru/for-engineers/documents/");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '2.4. ЛПТ'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '2. Паспорта и руководства'":
                    menuLevel[0] = 2;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Паспорта и руководства пользователя");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '2. Паспорта и руководства'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "3. Сертификаты":
                    menuLevel[0] = 3;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Сертификаты на оборудование LTV, LPA, ЛКД и ЛПТ\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '3. Сертификаты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "3.1. LTV":
                    menuLevel[0] = 3;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Сертификаты на оборудование LTV: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '3.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "3.2. LPA":
                    menuLevel[0] = 3;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Сертификаты на оборудование LPA: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '3.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "3.3. ЛКД":
                    menuLevel[0] = 3;
                    menuLevel[1] = 3;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Сертификаты на оборудование ЛКД: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '3.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "3.4. ЛПТ":
                    menuLevel[0] = 3;
                    menuLevel[1] = 4;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Сертификаты на оборудование ЛПТ: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '3.4. ЛПТ'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '3. Сертификаты'":
                    menuLevel[0] = 3;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Сертификаты на оборудование LTV, LPA, ЛКД и ЛПТ\n");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": Назад в меню '3. Сертификаты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4. Типовые чертежи и проекты":
                    menuLevel[0] = 4;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи и проекты");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4. Типовые чертежи и проекты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.1. Типовые чертежи":
                    menuLevel[0] = 4;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.1. Типовые чертежи'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.1.1. LTV":
                    menuLevel[0] = 4;
                    menuLevel[1] = 1;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи LTV \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.1.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.1.2. LPA":
                    menuLevel[0] = 4;
                    menuLevel[1] = 1;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи LPA \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.1.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.1.3. ЛКД":
                    menuLevel[0] = 4;
                    menuLevel[1] = 1;
                    menuLevel[2] = 3;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи ЛКД \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.1.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.1.4. ЛПТ":
                    menuLevel[0] = 4;
                    menuLevel[1] = 1;
                    menuLevel[2] = 4;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи ЛПТ \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.1.4. ЛПТ'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '4.1. Типовые чертежи'":
                    menuLevel[0] = 4;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.1. Типовые чертежи'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2. Типовые проекты":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые проекты Луис+");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2. Типовые проекты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1. По типу объекта":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые проекты с фильтром по типу объекта");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1. По типу объекта'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.1. Медицинские учреждения":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 1;
                    stringBuilder.append("Типовые проекты медицинских учреждений: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.1. Медицинские учреждения'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.2. Административные здания":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 2;
                    stringBuilder.append("Типовые проекты административных зданий: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.2. Административные здания'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.3. Спортивные объекты":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 3;
                    stringBuilder.append("Типовые проекты спортивных объектов: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.3. Спортивные объекты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.4. Учебные заведения":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 4;
                    stringBuilder.append("Типовые проекты учебных заведений: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.4. Учебные заведения'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.5. Объекты культуры и отдыха":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 5;
                    stringBuilder.append("Типовые проекты объектов культуры и отдыха: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.5. Объекты культуры и отдыха'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.6. Объекты торговли":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 6;
                    stringBuilder.append("Типовые проекты объектов торговли: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.6. Объекты торговли'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.7. Промышленные объекты":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 7;
                    stringBuilder.append("Типовые проекты промышленных объектов: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.7. Промышленные объекты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.8. Жилые здания":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 8;
                    stringBuilder.append("Типовые проекты жилых зданий: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.8. Жилые здания'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.9. Складские и логистические комплексы":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 9;
                    stringBuilder.append("Типовые проекты складских и логистических комплексов: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.9. Складские и логистические комплексы'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.1.10. Объекты транспортной инфраструктуры":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 10;
                    stringBuilder.append("Типовые проекты объектов транспортной инфраструктуры: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.1.10. Объекты транспортной инфраструктуры'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '4.2.1. По типу объекта'":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 1;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые проекты с фильтром по типу объекта");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": 'Назад в меню '4.2.1. По типу объекта'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.2. По бренду":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые проекты с фильтром по бренду");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.2. По бренду'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.2.1. LTV":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 1;
                    stringBuilder.append("Типовые проекты с применением оборудования LTV: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.2.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.2.2. LPA":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 2;
                    stringBuilder.append("Типовые проекты с применением оборудования LPA: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.2.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.2.3. ЛКД":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 3;
                    stringBuilder.append("Типовые проекты с применением оборудования ЛКД: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.2.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "4.2.2.4. ЛПТ":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 4;
                    stringBuilder.append("Типовые проекты с применением оборудования ЛПТ: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '4.2.2.4. ЛПТ'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '4.2.2. По бренду'":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 2;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые проекты с фильтром по бренду");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": 'Назад в меню '4.2.2. По бренду'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '4.2. Типовые проекты'":
                    menuLevel[0] = 4;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые проекты");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": 'Назад в меню '4.2. Типовые проекты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню '4. Типовые чертежи и проекты'":
                    menuLevel[0] = 4;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Типовые чертежи и проекты");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": 'Назад в меню '4. Типовые чертежи и проекты'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "5. Нормативная документация":
                    menuLevel[0] = 5;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Нормативная документация для проектировщиков и инженеров: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '5. Нормативная документация'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "6. Инструменты для инженеров и проектировщиков":
                    menuLevel[0] = 6;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Инструменты для инженеров и проектировщиков");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '6. Инструменты для инженеров и проектировщиков'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "6.1. Калькуляторы":
                    menuLevel[0] = 6;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Калькуляторы для инженеров и проектировщиков: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '6.1. Калькуляторы'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "6.2. BIM-модели (семейства Revit)":
                    menuLevel[0] = 6;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("BIM-модели (семейства Revit): \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '6.2. BIM-модели (семейства Revit)'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "7. Презентации и маркетинговые материалы":
                    menuLevel[0] = 7;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Презентации и маркетинговые материалы");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '7. Презентации и маркетинговые материалы'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "7.1. LTV":
                    menuLevel[0] = 7;
                    menuLevel[1] = 1;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Презентации и маркетинговые материалы LTV: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '7.1. LTV'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "7.2. LPA":
                    menuLevel[0] = 7;
                    menuLevel[1] = 2;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Презентации и маркетинговые материалы LPA: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '7.2. LPA'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "7.3. ЛКД":
                    menuLevel[0] = 7;
                    menuLevel[1] = 3;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Презентации и маркетинговые материалы ЛКД: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '7.3. ЛКД'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "7.4. ЛПТ":
                    menuLevel[0] = 7;
                    menuLevel[1] = 4;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    stringBuilder.append("Презентации и маркетинговые материалы ЛПТ: \n");
                    stringBuilder.append("...");
                    sendMsg(menuLevel, message, stringBuilder.toString());
                    logger.info(userFirstName + " " + userLastName + ": '7.4. ЛПТ'");
                    break;
                //------------------------------------------------------------------------------------------------//
                case "Назад в меню":
                    menuLevel[0] = 0;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    sendMsg(menuLevel, message, "Меню");
                    logger.info(userFirstName + " " + userLastName + ": 'Меню'");
                    break;
                default:
                    menuLevel[0] = 0;
                    menuLevel[1] = 0;
                    menuLevel[2] = 0;
                    menuLevel[3] = 0;
                    sendMsg(menuLevel, message, "Воспользуйтесь меню для продолжения");
                    logger.info(userFirstName + " " + userLastName + ": 'something wrong'");
                    break;
            }
        }
    }

    public void sendMsg (int[] menuLevel, Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        // Создаем клавиатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();
        Menu menu = new Menu();

        // Определяем уровень меню
        // 0.0.0.0. Меню
        if(menuLevel[0] == 0 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_0_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 1.0.0.0. Каталоги
        else if(menuLevel[0] == 1 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_1_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 1.1.0.0. LTV
        else if(menuLevel[0] == 1 && menuLevel[1] == 1 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_1_1_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 1.2.0.0. LPA
        else if(menuLevel[0] == 1 && menuLevel[1] == 2 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_1_2_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 1.3.0.0. ЛКД
        else if(menuLevel[0] == 1 && menuLevel[1] == 3 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_1_3_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 1.4.0.0. ЛПТ
        else if(menuLevel[0] == 1 && menuLevel[1] == 4 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_1_4_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.0.0.0. Паспорта и руководства
        else if(menuLevel[0] == 2 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.0.0. LTV
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.1.0. 1 серия
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 1 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_1_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.2.0. 2 серия
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 2 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_2_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.3.0. 3 серия
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 3 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_3_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.4.0. 5 серия
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 4 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_4_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.5.0. Е серия
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 5 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_5_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.6.0. Аналог
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 6 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_6_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.7.0. LTV-BOX
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 7 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_7_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.8.0. Термокожухи
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 8 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_8_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.9.0. Мониторы
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 9 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_9_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.1.10.0. Объективы
        else if(menuLevel[0] == 2 && menuLevel[1] == 1 && menuLevel[2] == 10 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_1_10_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.0.0. LPA
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.1.0. LPA-LX
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_1_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.1.1. Микрофонные консоли LPA-LX
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 1) {
            try {
                execute(menu.level_2_2_1_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.1.2. Основное оборудование LPA-LX
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 2) {
            try {
                execute(menu.level_2_2_1_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.2.0. LPA-DUO
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_2_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.2.1. Микрофонные консоли LPA-DUO
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 1) {
            try {
                execute(menu.level_2_2_2_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.2.2. Основное оборудование LPA-DUO
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 2) {
            try {
                execute(menu.level_2_2_2_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.3.0. LPA-Presta
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 3 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_3_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.3.1. LPA-Presta-2
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 3 && menuLevel[3] == 1) {
            try {
                execute(menu.level_2_2_3_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.3.2. LPA-Presta-8
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 3 && menuLevel[3] == 2) {
            try {
                execute(menu.level_2_2_3_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.3.3. LPA-Presta-16
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 3 && menuLevel[3] == 3) {
            try {
                execute(menu.level_2_2_3_3(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.3.4. LPA-Presta-BOX
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 3 && menuLevel[3] == 4) {
            try {
                execute(menu.level_2_2_3_4(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.4.0. LPA-EVA
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 4 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_4_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.4.1. Микрофонные консоли LPA-EVA
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 4 && menuLevel[3] == 1) {
            try {
                execute(menu.level_2_2_4_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.4.2. Основное оборудование LPA-EVA
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 4 && menuLevel[3] == 2) {
            try {
                execute(menu.level_2_2_4_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.4.3. Усилители LPA-EVA
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 4 && menuLevel[3] == 3) {
            try {
                execute(menu.level_2_2_4_3(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.4.4. Дополнительное оборудование LPA-EVA
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 4 && menuLevel[3] == 4) {
            try {
                execute(menu.level_2_2_4_4(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.5.0. LPA-IP
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 5 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_5_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.5.1. Аудио интерком LPA-IP
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 5 && menuLevel[3] == 1) {
            try {
                execute(menu.level_2_2_5_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.5.2. Видео интерком LPA-IP
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 5 && menuLevel[3] == 2) {
            try {
                execute(menu.level_2_2_5_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.5.3. Звукоусиление LPA-IP
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 5 && menuLevel[3] == 3) {
            try {
                execute(menu.level_2_2_5_3(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.5.4. Программное обеспечение LPA-IP
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 5 && menuLevel[3] == 4) {
            try {
                execute(menu.level_2_2_5_4(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.2.6.0. LPA-speakers
        else if(menuLevel[0] == 2 && menuLevel[1] == 2 && menuLevel[2] == 6 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_2_6_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.0.0. ЛКД
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.1.0. Биометрические контроллеры
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 1 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_1_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.2.0. Доводчики
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 2 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_2_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.3.0. Домофония
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 3 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_3_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.4.0. Замки
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 4 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_4_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.5.0. Идентификаторы
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 5 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_5_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.6.0. ИК-извещатели
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 6 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_6_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.7.0. Кнопки выхода
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 7 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_7_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.8.0. Контроллеры
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 8 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_8_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.9.0. Металлодетекторы
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 9 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_9_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.10.0. Ограждения полуростовые
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 10 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_10_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.11.0. Считыватели
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 11 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_11_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.3.12.0. Турникеты и картоприемник
        else if(menuLevel[0] == 2 && menuLevel[1] == 3 && menuLevel[2] == 12 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_3_12_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 2.4.0.0. ЛПТ
        else if(menuLevel[0] == 2 && menuLevel[1] == 4 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_2_4_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 3.0.0.0. Сертификаты
        else if(menuLevel[0] == 3 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_3_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.0.0.0. Типовые чертежи и проекты
        else if(menuLevel[0] == 4 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.1.0.0. Типовые чертежи
        else if(menuLevel[0] == 4 && menuLevel[1] == 1 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_1_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.1.1.0. LTV
        else if(menuLevel[0] == 4 && menuLevel[1] == 1 && menuLevel[2] == 1 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_1_1_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.1.2.0. LPA
        else if(menuLevel[0] == 4 && menuLevel[1] == 1 && menuLevel[2] == 2 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_1_2_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.1.3.0. ЛКД
        else if(menuLevel[0] == 4 && menuLevel[1] == 1 && menuLevel[2] == 3 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_1_3_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.1.4.0. ЛПТ
        else if(menuLevel[0] == 4 && menuLevel[1] == 1 && menuLevel[2] == 4 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_1_4_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.0.0. Типовые проекты
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_2_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.0. По типу объекта
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_2_1_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.1. Медицинские учреждения
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 1) {
            try {
                execute(menu.level_4_2_1_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.2. Административные здания
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 2) {
            try {
                execute(menu.level_4_2_1_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.3. Спортивные объекты
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 3) {
            try {
                execute(menu.level_4_2_1_3(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.4. Учебные заведения
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 4) {
            try {
                execute(menu.level_4_2_1_4(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.5. Объекты культуры и отдыха
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 5) {
            try {
                execute(menu.level_4_2_1_5(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.6. Объекты торговли
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 6) {
            try {
                execute(menu.level_4_2_1_6(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.7. Промышленные объекты
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 7) {
            try {
                execute(menu.level_4_2_1_7(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.8. Жилые здания
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 8) {
            try {
                execute(menu.level_4_2_1_8(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.9. Складские и логистические комплексы
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 9) {
            try {
                execute(menu.level_4_2_1_9(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.1.10. Объекты транспортной инфраструктуры
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 1 && menuLevel[3] == 10) {
            try {
                execute(menu.level_4_2_1_10(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.2.0. По бренду
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 0) {
            try {
                execute(menu.level_4_2_2_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.2.1. LTV
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 1) {
            try {
                execute(menu.level_4_2_2_1(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.2.2. LPA
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 2) {
            try {
                execute(menu.level_4_2_2_2(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.2.3. ЛКД
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 3) {
            try {
                execute(menu.level_4_2_2_3(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 4.2.2.4. ЛПТ
        else if(menuLevel[0] == 4 && menuLevel[1] == 2 && menuLevel[2] == 2 && menuLevel[3] == 4) {
            try {
                execute(menu.level_4_2_2_4(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 5.0.0.0. Нормативная документация
        else if(menuLevel[0] == 5 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_5_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 6.0.0.0. Инструменты для инженеров и проектировщиков
        else if(menuLevel[0] == 6 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_6_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 6.1.0.0. Калькуляторы
        else if(menuLevel[0] == 6 && menuLevel[1] == 1 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_6_1_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 6.2.0.0. BIM-модели (семейства Revit)
        else if(menuLevel[0] == 6 && menuLevel[1] == 2 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_6_2_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 7.0.0.0. Презентации и маркетинговые материалы
        else if(menuLevel[0] == 7 && menuLevel[1] == 0 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_7_0_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 7.1.0.0. LTV
        else if(menuLevel[0] == 7 && menuLevel[1] == 1 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_7_1_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 7.2.0.0. LPA
        else if(menuLevel[0] == 7 && menuLevel[1] == 2 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_7_2_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 7.3.0.0. ЛКД
        else if(menuLevel[0] == 7 && menuLevel[1] == 3 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_7_3_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        // 7.4.0.0. ЛПТ
        else if(menuLevel[0] == 7 && menuLevel[1] == 4 && menuLevel[2] == 0 && menuLevel[3] == 0) {
            try {
                execute(menu.level_7_4_0_0(keyboard, replyKeyboardMarkup, sendMessage, message, text));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }


    }
}
