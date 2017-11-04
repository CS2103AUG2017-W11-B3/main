package seedu.address.ui;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import guitests.AddressBookGuiTest;

public class MainWindowTest extends AddressBookGuiTest {

    @Test
    public void currentThemeDisplayed() {
        // Use menu button
        mainWindowHandle.getMainMenu().changeToDarkThemeUsingMenu();
        assertEquals(MainWindow.getCurrentTheme(), "view/DarkTheme.css");
        mainWindowHandle.getMainMenu().changeToLightThemeUsingMenu();
        assertEquals(MainWindow.getCurrentTheme(), "view/LightTheme.css");
    }
}