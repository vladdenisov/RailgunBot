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

package me.argraur.railgun.commands;

import me.argraur.railgun.RailgunBot;
import me.argraur.railgun.interfaces.RailgunOrder;

public class ExampleCommand implements RailgunOrder {
    // @param String, command name
    private String exampleCommand = RailgunBot.COMMAND_PREFIX + "example";

    /**
     * Returns command name (used by CommandHandler)
     * @return command name
     */
    @Override
    public String getCommand() {
        return exampleCommand;
    }

    /**
     * Called by CommandHandler when received message with exampleCommand
     * @param Message body
     */
    @Override
    public void call(String args) {}

    /**
     * Used by call to create reply, optional.
     * @param Message body
     * @return null
     */
    @Override
    public String getOutput(String args) {
        return null;
    }

    /**
     * Used by HelpCommand to create the help embed message.
     * @return StringBuilder containing help for this command.
     */
    @Override
    public StringBuilder getHelp() {
        StringBuilder sb = new StringBuilder();
        sb.append(exampleCommand).append(" - Example command.");
        return sb;
    }
}