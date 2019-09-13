package com.gmail.dmitry.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {
    private MessageBean messageBean = new MessageBean();

//    public MainView(@Autowired MessageBean bean) {
//        Button button = new Button("Click me",
//                e -> Notification.show(bean.getMessage()));
//        add(button);
//    }

   public MainView() {
//        Button button = new Button("Click me", e-> Notification.show("Hello world"));
//        add(button);
       add(new ProductForm());
   }

}
