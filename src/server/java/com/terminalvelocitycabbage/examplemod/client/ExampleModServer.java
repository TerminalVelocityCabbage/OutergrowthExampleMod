package com.terminalvelocitycabbage.examplemod.client;

import com.terminalvelocitycabbage.engine.debug.Log;
import com.terminalvelocitycabbage.engine.mod.ModEntrypoint;
import com.terminalvelocitycabbage.engine.mod.ModServerEntrypoint;

import static com.terminalvelocitycabbage.examplemod.common.ExampleMod.ID;

@ModServerEntrypoint()
public class ExampleModServer extends ModEntrypoint {

    public ExampleModServer() {
        super(ID);
    }

    @Override
    public void registerEventListeners() {

    }

    @Override
    public void init() {
        Log.info("Mod init");
    }

    @Override
    public void destroy() {
        Log.info("Mod Destroy");
    }
}