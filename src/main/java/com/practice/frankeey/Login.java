package com.practice.frankeey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath="//[@name='email']")
	public static WebElement mail;

}
