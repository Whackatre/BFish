/*
 * Bika's Fish is a re-make of an old Scratch project.
 * Copyright (C) 2012	Justin Zeng
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.skyrealm.bfish.util.timer.ext;

import java.util.TimerTask;

import net.skyrealm.bfish.Main;

/**
 * Handles the game timer.
 * @author justin.zeng1
 *
 */

public class GameTimer extends TimerTask {
	
	public GameTimer() {
		super();
	}

	@Override
	public void run() {
		Main.getWorld().addTime(-1);
	}

}
