package org.chaos.scripts.claysoftener.actions.bank;

import org.chaos.core.action.Action;
import org.chaos.scripts.claysoftener.ClaySoftener;

/**
 * @author chaos_
 * @since 1.0 <6:23 PM - 06/11/13>
 */
public class Open extends Action<ClaySoftener> {

    public Open(ClaySoftener script) {
        super(script);
    }

    @Override
    public boolean call() {
        return !ctx.bank.isOpen() && !script.methods().hasClay();
    }

    @Override
    public boolean execute() {
        script.setStatus("Opening bank.");
        return ctx.bank.open();
    }

}
