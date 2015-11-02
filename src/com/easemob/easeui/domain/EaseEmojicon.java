package com.easemob.easeui.domain;

public class EaseEmojicon {
    public EaseEmojicon(){
    }
    
    /**
     * @param icon 静态图片resource id
     * @param emojiText 表情emoji文本内容
     */
    public EaseEmojicon(int icon, String emojiText){
        this.icon = icon;
        this.emojiText = emojiText;
    }
    
    public EaseEmojicon(String name, String iconPath){
        this.name = name;
        this.iconPath = iconPath;
    }
    
    /**
     * static icon resource id
     */
    private int icon;
    
    /**
     * dynamic icon resource id
     */
    private int bigIcon;
    
    /**
     * 表情emoji文本内容,大表情此项内容可以为null
     */
    private String emojiText;
    
    /**
     * 表情所对应的名称
     */
    private String name;
    
    /**
     * 普通or大表情
     */
    private Type type;
    
    /**
     * 表情静态图片地址
     */
    private String iconPath;
    
    /**
     * 大表情图片地址
     */
    private String bigIconPath;
    
    
    
    public int getIcon() {
        return icon;
    }



    public void setIcon(int icon) {
        this.icon = icon;
    }



    public int getBigIcon() {
        return bigIcon;
    }



    public void setBigIcon(int dynamicIcon) {
        this.bigIcon = dynamicIcon;
    }



    public String getEmojiText() {
        return emojiText;
    }



    public void setEmojiText(String emojiText) {
        this.emojiText = emojiText;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }



    public void setType(Type type) {
        this.type = type;
    }



    public String getIconPath() {
        return iconPath;
    }



    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }



    public String getBigIconPath() {
        return bigIconPath;
    }



    public void setBigIconPath(String bigIconPath) {
        this.bigIconPath = bigIconPath;
    }



    public enum Type{
        /**
         * 普通表情，可以一次输入多个到edittext
         */
        NORMAL,
        /**
         * 大表情，点击之后直接发送
         */
        BIG_EXPRESSION
    }
}
