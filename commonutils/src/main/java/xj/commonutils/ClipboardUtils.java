package xj.commonutils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/**
 * @author meitu.xujun on 2017/8/30 20:41
 * @version 0.1
 */
public class ClipboardUtils {

    /**
     * 实现文本复制功能
     *
     *
     * @param content
     */
    public static void copy(String content, Context context) {
        // 得到剪贴板管理器
        ClipboardManager cmb = (ClipboardManager) context.getSystemService(Context
                .CLIPBOARD_SERVICE);
        cmb.setPrimaryClip(ClipData.newPlainText(null, content.trim()));
//        cmb.setText(content.trim());
    }

    /**
     * 实现粘贴功能
     *
     *
     * @param context
     * @return
     */
    public static String paste(Context context) {
        // 得到剪贴板管理器
        ClipboardManager cmb = (ClipboardManager) context.getSystemService(Context
                .CLIPBOARD_SERVICE);
        return cmb.getPrimaryClip().toString().trim();
//        return cmb.getText().toString().trim();
    }
}
