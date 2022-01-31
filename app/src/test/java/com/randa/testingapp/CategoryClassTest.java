package com.randa.testingapp;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(GoodTest.class)
@Suite.SuiteClasses({LoginTest.class,SignUpTest.class})
public class CategoryClassTest {
}
