package Other;

import org.openqa.selenium.By;

public class BasePage {
    //Login page locators
    public static final By LOGO = By.xpath("//div[@class=\"container unauthenticated z-10\"]");
    public static final By LOGIN_HEADER = By.xpath("//h1[@class=\"font-inter font-bold text-white\"]");
    public static final By LOGIN_QR_HEADER = By.xpath("//h1[@class=\"mt-5 font-inter font-bold text-white\"]");
    public static final By LOGIN_BY_QR = By.xpath("//button[@class=\"w-full h-11 mt-7 bg-transparent text-white py-2 px-4 border border-white/50 rounded-lg flex items-center justify-center\"]");
    public static final By LOGIN_BY_KEY = By.xpath("//button[@id=\"importKeyButton\"]");
    public static final By LOGIN_BY_SHARING = By.xpath("//button[@id=\"recoverKeyButton\"]");
    public static final By QR_IMG = By.xpath("//div[@class=\"mt-5 border rounded border-white/10 rounded-xl p-10\"]");
    public static final By QR_MESSAGE = By.xpath("//p[@class=\"mt-2.5 font-inter text-sm text-white/50\"]");
    public static final By LOGIN_BY_KEY_HEADER = By.xpath("//h1[@class=\"mt-5 font-inter font-bold text-white\"]");
    public static final By LOGIN_BY_KEY_SEND = By.xpath("//form[@id=\"my-keys-file-form\"]/input");
    public static final By LOGIN_BY_KEY_PASSWORD_FIELD = By.xpath("//input[@id=\"logout-import-own-keyring-password-form_password\"]");
    public static final By LOGIN_BY_KEY_SUBMIT = By.xpath("//button[@type=\"submit\"]");
    public static final By LOGIN_NEW_USER = By.xpath("//input[@id=\"login-form_name\"]");
    public static final By LOGIN_BUTTON = By.xpath("//button[@class=\"w-full h-11 focus:outline-none text-white px-4 rounded-lg\"]");
    public static final By LOGIN_CHECKBOX = By.xpath("//input[@id=\"note\"]");
    public static final By LOGOUT_BUTTON = By.xpath("//button[@class=\"sidebarIcon mb-1\"]");
    public static final By LOGOUT_WITHOUT_KEYS = By.xpath("//button[@class=\"mt-3 w-full h-12 border rounded-lg border-black/10 t-logout-without-key\"]");
    public static final By LOGOUT_SUBMIT = By.xpath("//button[@phx-click=\"logout-wipe\"]");
    //My notes locators
    public static final By USERNAME = By.xpath("//div[@class=\"inline-flex\"][1]/div[@class=\"text-sm\"]");
    public static final By IMAGE_OPENER = By.xpath("//img[@class=\"object-cover overflow-hidden\"]");
    public static final By CHAT_MESSAGE_DATE = By.xpath("//div[@class=\"px-2 text-grayscale600 flex justify-end mr-1\"]");
    public static final By CHAT_FILE_NAME = By.xpath("//span[@class=\"truncate text-xs x-file\"]");
    public static final By CHAT_FILE_SIZE = By.xpath("//span[@class=\"text-xs text-black/50 whitespace-pre-line\"]");
    public static final By GALLERY_IMAGE = By.xpath("//img[@id=\"galleryImage\"]");
    public static final By GALLERY_BACK_BUTTON = By.xpath("//button[@class=\"text-white flex z-20\"]");
    public static final By CHAT_MESSAGE_MODAL = By.xpath("//button[@class=\"messageActionsDropdownButton hiddenUnderSelection t-message-dropdown\"]");
    public static final By CHAT_MESSAGE_MODAL_EDIT = By.xpath("//a[@class=\"dropdownItem t-edit-message\"]");
    public static final By CHAT_MESSAGE_MODAL_DELETE = By.xpath("//a[@class=\"dropdownItem t-delete-message\"]");
    public static final By POPUP_DELETE_AGREE_BUTTON = By.xpath("//button[@class=\"deleteMessageButton w-full ml-1 h-12 border-0 rounded-lg bg-red-500 flex items-center justify-center t-delete-message-btn\"]");
    public static final By CHAT_VIDEO = By.xpath("//video[@class=\"a-video\"]");
    public static final By SIDEBAR_LIST = By.xpath("//div[@id=\"dialog-list\"]/ul");
    public static final By SIDEBAR_LIST_ELEMENT = By.xpath("//div[@id=\"dialog-list\"]/ul/li");
    public static final By CHAT_AUDIO_PLAY_BUTTON = By.xpath("//button[@class=\"play rounder flex justify-center items-center w-3/12\"]");
    public static final By CHAT_AUDIO = By.xpath("//audio[@class=\"a-audio hidden\"]");
    public static final By CHAT_TEXT_SUBMIT_BUTTON = By.xpath("//button[@id=\"dialog-form-submit-button\"]");
    public static final By CHAT_TEXT_SUBMIT_BUTTON_ROOM = By.xpath("//button[@id=\"room-form-submit-button\"]");
    public static final By CHAT_TEXT_SUBMIT_EDIT_BUTTON = By.xpath("//button[@id=\"dialog-edit-form-submit-button\"]");
    public static final By CHAT_TEXT_MESSAGE = By.xpath("//div[@class=\"px-4 w-full\"]");
    //Rooms locators
    public static final By ROOM_PAGE = By.xpath("//button[@class=\"sidebarIcon mt-9 t-rooms\"]");
    public static final By CREATE_ROOM_BUTTON = By.xpath("//button[@id=\"room-create-toggle\"]");
    public static final By CREATE_ROOM_MODAL_SUBMIT_BUTTON = By.xpath("//button[@type=\"submit\"]");
    public static final By FIRST_ROOM = By.xpath("//div[@class=\"ml-1 text-sm\"]");
    public static final By MY_FIRST_MESSAGE = By.xpath("//div[@class=\"bg-purple50 max-w-xs sm:max-w-md min-w-[180px] t-chat-mine-message rounded-lg shadow-lg\"]/span");
    public static final By ROOM_TEXT_SUBMIT_EDIT_BUTTON = By.xpath("//button[@id=\"room-edit-form-submit-button\"]");


}
