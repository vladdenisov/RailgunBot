/*
 * Copyright (C) 2020 Arseniy Graur
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.argraur.railgun.interfaces;

/**
 * Universal Interface for all Railgun commands
 */
public interface RailgunOrder {
    /**
     *
     * @param args Message without command
     * @return Returns command result to call(String args) after parsing args
     */
    String getOutput(String args);

    /**
     *
     * @return Returns command name String
     */
    String getCommand();

    /**
     *
     * @return Returns StringBuilder with help
     */
    StringBuilder getHelp();

    /**
     *
     * @param args Message with command
     */
    void call(String args);
}
