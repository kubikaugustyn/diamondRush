// package javax.microedition.lcdui;


javax.microedition.lcdui.Choice = {// public interface Choice {

    EXCLUSIVE: 1,// static final int EXCLUSIVE = 1;
    MULTIPLE: 2,// static final int MULTIPLE = 2;
    IMPLICIT: 3,// static final int IMPLICIT = 3;
    POPUP: 4,// static final int POPUP = 4;

    TEXT_WRAP_ON: 1,// static final int TEXT_WRAP_ON = 1;
    TEXT_WRAP_OFF: 2,// static final int TEXT_WRAP_OFF = 2;
    TEXT_WRAP_DEFAULT: 0,// static final int TEXT_WRAP_DEFAULT = 0;


    append: function (stringPart, imagePart) {// int append(String stringPart, Image imagePart);
    },

    delete: function (elementNum) {// void delete(int elementNum);
    },

    deleteAll: function () {// void deleteAll();
    },

    getFitPolicy: function () {// int getFitPolicy();
    },

    getFont: function () {// Font getFont(int elementNum);
    },

    getImage: function (elementNum) {// Image getImage(int elementNum);
    },

    getSelectedFlags: function (selectedArray_return) {// int getSelectedFlags(boolean[] selectedArray_return);
    },

    getSelectedIndex: function () {// int getSelectedIndex();
    },

    getString: function (elementNum) {// String getString(int elementNum);
    },

    insert: function (elementNum, stringPart, imagePart) {// void insert(int elementNum, String stringPart, Image imagePart);
    },

    isSelected: function (elementNum) {// boolean isSelected(int elementNum);
    },

    set: function (elementNum, stringPart, imagePart) {// void set(int elementNum, String stringPart, Image imagePart);
    },

    setFitPolicy: function (fitPolicy) {// void setFitPolicy(int fitPolicy);
    },

    setFont: function (elementNum, font) {// void setFont(int elementNum, Font font);
    },

    setSelectedFlags: function (selectedArray) {// void setSelectedFlags(boolean[] selectedArray);
    },

    setSelectedIndex: function (elementNum, selected) {// void setSelectedIndex(int elementNum, boolean selected);
    },

    size: function (elementNum) {// int size();
    }

}// }

