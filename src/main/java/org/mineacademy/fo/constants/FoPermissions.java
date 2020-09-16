package org.mineacademy.fo.constants;

import org.mineacademy.fo.command.Permission;

/**
 * Used to store basic library permissions
 */
public class FoPermissions {

	@Permission(value = "Receive plugin update notifications on join.")
	public static final String NOTIFY_UPDATE = "{plugin_name}.notify.update";
}