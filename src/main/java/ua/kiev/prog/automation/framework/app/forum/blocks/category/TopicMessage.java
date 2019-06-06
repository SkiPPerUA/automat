package ua.kiev.prog.automation.framework.app.forum.blocks.category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;

import java.util.List;

public class TopicMessage extends Widget {

    public TopicMessage(Locator locator) {
        super(locator);
    }

    public String author(int x){

        List<WebElement> auth = this.element().findElements(By.xpath(".//*[@id='quickModForm']/div/div/div/h4/a"));

        String [] name = new String [auth.size()];

        for (int i = 0; i < auth.size(); i++){
            name [i] = auth.get(i).getText();

        }
        return name[x];

    }

    public String message(int x){

        List<WebElement> mess = Session.get().driver().findElements(By.xpath(".//div[@class='inner']"));

        String [] messages = new String[mess.size()];

        for (int i = 0; i < mess.size(); i++){
            messages [i] = mess.get(i).getText();
        }
        return messages[x];
    }

}
