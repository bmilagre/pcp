/*
 * Copyright 2026 Roland Gisler, HSLU Informatik, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.pcp;

/**
 * Demo-Applikation für {@link ch.hslu.pcp.Stack}-Klasse.
 */
public final class DemoApp {

    /**
     * Privater Konstruktor.
     */
    private DemoApp() {}

    /**
     * Main-Methode.
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        Stack myStack = new Stack();
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
        myStack.print();
        myStack.top();
        myStack.push(new Element(42));
        myStack.push(new Element(77));
        myStack.push(new Element(1));
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
        myStack.print();
        myStack.push(new Element(33));
        myStack.pop();
        myStack.push(new Element(33));
        myStack.print();
        Element e = myStack.top();
        System.out.println("top Element is " + e.getValue());
    }
}
