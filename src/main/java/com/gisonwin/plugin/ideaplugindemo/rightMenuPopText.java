package com.gisonwin.plugin.ideaplugindemo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.Messages;

import java.util.Objects;

public class rightMenuPopText extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        String selectedText = Objects.requireNonNull(e.getData(PlatformDataKeys.EDITOR)).getSelectionModel().getSelectedText();
        Messages.showInfoMessage("选中的文本为:"+selectedText,"选中的文本");
    }
}
