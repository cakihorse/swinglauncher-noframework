package fr.cakihorse.swinglauncher.threads;

import fr.cakihorse.swinglauncher.app.Launcher;

public class LaunchThread extends Thread {
    @Override
    public void run() {
        try {
            Launcher.update();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Launcher.testlaunch("1.8.8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
