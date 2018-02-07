package org.icrc.ampm.am.service.cucumber.stepdefs;

import org.icrc.ampm.am.service.AnteMortemServiceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AnteMortemServiceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
