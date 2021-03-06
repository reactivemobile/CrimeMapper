package com.reactivemobile.ukpoliceapp.ui.welcome;

/**
 * Contract defining methods for Welcome screen view and presenter
 */
interface WelcomeContract {
    interface WelcomeViewContract {
        void disclaimerAccepted(boolean isAccepted);
    }

    interface WelcomePresenterContract {
        void setDisclaimerAccepted(boolean isAccepted);

    }
}
