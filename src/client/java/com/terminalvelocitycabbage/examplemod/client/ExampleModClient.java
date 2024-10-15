package com.terminalvelocitycabbage.examplemod.client;

import com.terminalvelocitycabbage.engine.debug.Log;
import com.terminalvelocitycabbage.engine.mod.ModClientEntrypoint;
import com.terminalvelocitycabbage.engine.mod.ModEntrypoint;

import static com.terminalvelocitycabbage.examplemod.common.ExampleMod.ID;

@ModClientEntrypoint()
public class ExampleModClient extends ModEntrypoint {

    public ExampleModClient() {
        super(ID);
    }

    @Override
    public void registerEventListeners() {
    }

    @Override
    public void init() {
        Log.info("Mod init: " + getNamespace());
    }

    @Override
    public void destroy() {
        Log.info("Mod Destroy");
    }
}