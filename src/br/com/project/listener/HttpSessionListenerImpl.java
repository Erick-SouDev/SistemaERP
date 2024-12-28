package br.com.project.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.stereotype.Controller;


@Controller
public class HttpSessionListenerImpl implements HttpSessionListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent session) {
		java.util.logging.Logger.getGlobal().info("criando session --->" + session.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent session) {
		java.util.logging.Logger.getGlobal().info("destruindo session --->" + session.getSession().getId());
	}

}
