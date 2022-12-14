package me.darknet.commandsystem.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Command {

    String value();

    String[] aliases() default {};

    String description() default "";

    String noPermission() default "You do not have permission to use this command.";

    String usage() default "";

    String permission() default "";
}
