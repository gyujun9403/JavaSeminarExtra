package com.company;

import java.util.Objects;

public class TestClass implements Cloneable{
        private String name;
        public TestClass(String name) {
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}
