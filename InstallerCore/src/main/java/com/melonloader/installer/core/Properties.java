package com.melonloader.installer.core;

import java.nio.file.Path;

/**
 * keystore generation example
 * keytool -genkey -keystore melonloader.keystore -alias melonloader -storepass 123456 -keypass 123456 -keyalg RSA -keysize 2048 -validity 10000 -dname "cn=, ou=, c=, c="
 */
public class Properties {
    public String targetApk;
    public String libraryApk;
    public String outputApk;
    public String tempDir;
    public String dependencies;
    public String il2cppEtc;
    public String unityZip;

    public String unityProvider = "https://github.com/LemonLoader/AndroidNativeLibraries/raw/main/";
    public String unityVersion;

    // directly set a path instead - both need to be set to apply
    public Path unityNativeBase;
    public Path unityManagedBase;

    public String keystoreName = "cert";
    public String keystorePass = "123456";

    public ILogger logger;

    // Repatching stuff
    public boolean hasOriginalDex;
    // Split APK stuff
    public boolean isSplit;
    public FileReaderWriter readerWriter;
}
