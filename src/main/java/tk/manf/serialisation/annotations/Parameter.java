/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.manf.serialisation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parameter {
    public String name();
}
