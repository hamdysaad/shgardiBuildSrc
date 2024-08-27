object Config {

    const val localModules = true

    object AppConfig {
        const val appId = "com.mnasat.nashmi"

        const val compileSdkVersion = 34
        const val minSdkVersion = 23
        const val ndkVersion = "23.1.7779620"
        const val versionCode = 292
        const val versionName = "7.81"
        const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val consumerProguardFiles = "consumer-rules.pro"
        const val DeveloperFlavorDimension = "developer"
        const val DevDimension = "dev"
        const val StageDimension = "stage"
        const val ProdDimension = "prod"
        const val kotlinCompilerExtensionVersion = "1.4.7"

    }

    object Dependencies {
        const val jitPackURL = "https://jitpack.io"
        const val huwawiPackUrl = "https://developer.huawei.com/repo/"
        const val snapshots = "https://oss.sonatype.org/content/repositories/snapshots"
        const val braze_SDK = "https://appboy.github.io/appboy-android-sdk/sdk"
        const val gradleVersion = "com.android.tools.build:gradle:${Versions.gradleVersion}"
        const val appGalleryConnect = "com.huawei.agconnect:agcp:${Versions.appGalleryConnect}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val navigationSafeArgs =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidNavigation}"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
        const val google_services = "com.google.gms:google-services:4.3.14"
        const val huawei_services = "com.huawei.agconnect:agcp:1.2.1.301"
        const val crashlytics =
            "com.google.firebase:firebase-crashlytics-gradle:${Versions.crashlytics}"
        const val app_distribution =
            "com.google.firebase:firebase-appdistribution-gradle:${Versions.app_distribution}"
        const val google_secrets =
            "com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:${Versions.google_secrets}"
    }

    object Plugins {
        const val jetbrainskotlinAndroid = "org.jetbrains.kotlin.android"
        const val androidApplication = "com.android.application"
        const val androidLibrary = "com.android.library"
        const val kotlinAndroid = "kotlin-android"
        const val kotlinKapt = "kotlin-kapt"
        const val java_library = "java-library"
        const val kotlin_jvm = "org.jetbrains.kotlin.jvm"
        const val crashlytics = "com.google.firebase.crashlytics"
        const val google_services = "com.google.gms.google-services"
        const val agconnect = "com.huawei.agconnect"
        const val app_distribution = "com.google.firebase.appdistribution"
        const val navigationSafeArgs = "androidx.navigation.safeargs"
        const val navigationSafeArgsKTX = "androidx.navigation.safeargs.kotlin"
        const val kotlin_parcelize = "kotlin-parcelize"
        const val hilt = "dagger.hilt.android.plugin"
        const val google_secrets = "com.google.android.libraries.mapsplatform.secrets-gradle-plugin"
        const val maven_publish = "maven-publish"
        const val ksp = "com.google.devtools.ksp"
        const val huawei_agconnect = "com.huawei.agconnect"

    }

    object PackagingOptions {
        val excludeResources: MutableList<String> = mutableListOf<String>().apply {
            this.add("/META-INF/{AL2.0,LGPL2.1}")
            this.add("META-INF/DEPENDENCIES")
            this.add("META-INF/LICENSE")
            this.add("META-INF/NOTICE")
            this.add("META-INF/NOTICE.txt")
            this.add("META-INF/notice.txt")
            this.add("META-INF/ASL2.0")
        }
        val jniPickFirsts: MutableList<String> = mutableListOf<String>().apply {
            this.add("lib/armeabi-v7a/libassmidi.so")
            this.add("lib/x86/libassmidi.so")
        }
    }

    object Modules {
        const val core = ":core"
        const val drop_off = ":Dropoff"
        const val favourite_location = ":Lib:FavouriteLocation"
        const val lib_drop_off = ":Lib:Dropoff"
        const val lib_estimated_price_dialog = ":Lib:EstimatedPriceDialog"
        const val feature_cart = ":features:Cart"
        const val normal_order = ":features:NormalOrder"
        const val lib_image_selector_view = ":Lib:ImageSelectorView"
        const val lib_track = ":Lib:Track"
        const val features_get_help = ":features:gethelp"
        const val features_grocery = ":features:grocery"
        const val features_search = ":features:search"
        const val features_food = ":features:food"
        const val features_setting = ":features:setting"
        const val navigation_lib = ":Lib:Navigation"
        const val checkoutFeature = ":features:checkout"
        const val grocery_lib = ":Lib:Grocery"
        const val serve_you = ":ServeYou"
        const val lib_industry = ":Lib:Industry"
        const val send_package = ":SendPackage"
        const val food_lib = ":Lib:foodLib"
        const val service_fare_lib = ":Lib:ServiceFare"
        const val cart_lib = ":Lib:cartLib"
        const val ordering_lib = ":Lib:orderingLib"
        const val search_lib = ":Lib:SearchLib"
        const val recent_order_lib = ":Lib:RecentOrderLib"
        const val ordering_feature = ":features:ordering"
        const val addOnTimeVoucherLib = ":Lib:addOnTimeVoucher"
        const val checkoutLib = ":Lib:CheckoutLib"
        const val qrOrderFeature = ":features:qr_order"
        const val feature_invocie = ":features:invoice"
    }

    object NameSpaces {
        const val lib_drop_off_name_space = "shgardi.dropofflib"
        const val normal_order_name_space = "shgardi.normal_order"
    }

    object LocalModules {
        const val app = ":app"

        const val baseStructure = ":BaseModules:BaseStructure"

        //Libs
        const val baseCore = ":BaseModules:baseLibs:baseCore"
        const val baseImageSelector = ":BaseModules:baseLibs:ImageSelector"
        const val baseLocation = ":BaseModules:baseLibs:location"
        const val baseGmsHms = ":BaseModules:baseLibs:gms_hms"
        const val baseShgardiMap = ":BaseModules:baseLibs:shgardiMap"
        const val basePolygons = ":BaseModules:baseLibs:polygons"
        const val baseNetwork = ":BaseModules:baseLibs:network"
        const val baseSocket = ":BaseModules:baseLibs:socket"
        const val baseIntercom = ":BaseModules:baseLibs:intercom"
        const val payment = ":BaseModules:baseLibs:payment"
        const val baseAuth = ":BaseModules:baseLibs:auth"
        const val generalConfig = ":BaseModules:baseLibs:generalConfig"
        const val baseNavigation = ":BaseModules:baseLibs:BaseNavigation"
        const val base_utils = ":BaseModules:baseLibs:Utils"
        const val shgardi_logger = ":BaseModules:baseLibs:ShgardiLogger"

        //Base features
        const val baseFeature_orderChatGroup = ":BaseModules:baseFeatures:OrderChatGroup"
        const val baseFeature_authentication = ":BaseModules:baseFeatures:Authentication"
        const val baseFeature_notifications = ":BaseModules:baseFeatures:notifications"
        const val baseFeature_rating = ":BaseModules:baseFeatures:Rating"
        const val baseFeature_complaint = ":BaseModules:baseFeatures:complaint"
        const val baseFeature_donation = ":BaseModules:baseFeatures:donation"
        const val baseFeature_photoReviewer = ":BaseModules:baseFeatures:PhotoViewer"
        const val baseFeature_recipient_info = ":BaseModules:baseFeatures:recipient_info"
        const val serviceFeesLib = ":BaseModules:baseLibs:ServiceFees"


        //courier extras
        const val baseFeature_compalint = ":BaseModules:baseFeatures:complaint"
        const val intro = ":features:Intro"
        const val baseFeature_photoViewer = ":BaseModules:baseFeatures:PhotoViewer"
        const val feature_talqa = ":features:Talqa"
        const val utils_lib = ":BaseModules:baseLibs:Utils"

        object FinanceModule {
            const val wallet = ":features:wallet"
            const val loyalty = ":features:loyalty"
            const val walletLibrary = ":BaseModules:baseLibs:wallet"
            const val wallet_transactions = ":BaseModules:baseFeatures:wallet:walletTransactions"
            const val money_transfer = ":BaseModules:baseFeatures:wallet:moneyTransfer"
            const val charge_wallet_with_code =
                ":BaseModules:baseFeatures:wallet:chargeWalletWithCode"
            const val chargeWallet = ":BaseModules:baseFeatures:wallet:ChargeWallet"
            const val save_cards = ":BaseModules:baseFeatures:wallet:SavedCards"
            const val donation_lib = ":BaseModules:baseLibs:donationLib"
            const val hyperpaySdkLib = ":BaseModules:baseLibs:hyperpaySdkLib"
            const val hypersdkdeploy = ":BaseModules:baseLibs:hypersdkdeploy"
            const val hypersdkdebug = ":BaseModules:baseLibs:hypersdkdebug"


        }
    }
}