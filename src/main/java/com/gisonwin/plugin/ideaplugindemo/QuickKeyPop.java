package com.gisonwin.plugin.ideaplugindemo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class QuickKeyPop extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showInfoMessage("自定义快捷键生效","我的自定义快捷键生效");
    }
}
