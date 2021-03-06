package cn.yiiguxing.plugin.translate.action;

import cn.yiiguxing.plugin.translate.TranslationDialogManager;
import cn.yiiguxing.plugin.translate.ui.Icons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAware;

public class TranslationAction extends AnAction implements DumbAware {

    public TranslationAction() {
        super("TranslationDialog", "Translate", Icons.Translate);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        TranslationDialogManager.getInstance().showTranslationDialog(e.getProject());
    }

}
