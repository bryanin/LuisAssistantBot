package ru.bryanin.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;

public class Application {
    static Logger LOGGER;
    static {
        try(FileInputStream fileInputStream = new FileInputStream("/home/bryanin/IdeaProjects/LuisAssistantBot/src/main/resources/log.config")){
            LogManager.getLogManager().readConfiguration(fileInputStream);
            LOGGER = LoggerFactory.getLogger(Application.class);
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) {
        LOGGER.info("Start application...");
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotForEmployees());
            LOGGER.info("Register Bot...");
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
