package ru.bryanin.dev;

import org.apache.logging.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Start application...");

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotForEmployees());
            logger.info("Register Bot...");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

//        // Поиск в папке "2.2. Паспорта и руководства LPA"
//        SearchFile searchFile = new SearchFile("lx");
//        List<File> searchedFiles = searchFile.search(new File("/home/bryanin/Загрузки/LPA/2. Паспорта и руководства"));
//        for(File x : searchedFiles) {
//            stringBuilder.append(x.getAbsolutePath() + "\n");
//        }

//        // Поиск в папке "2. Паспорта и руководства"
//        SearchFile searchFile = new SearchFile("duo");
//        List<File> searchedFiles = searchFile.search(new File("/home/bryanin/Загрузки/LPA/2. Паспорта и руководства"));
//        for(File x : searchedFiles) {
//            System.out.println(x.getAbsolutePath());
//        }
    }
}
