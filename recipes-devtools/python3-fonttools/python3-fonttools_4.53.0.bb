#Author chetan@novelmicrodevices.com
#Last update: 8/22/2024
SUMMARY = "FontTools library for manipulating fonts"
DESCRIPTION = "FontTools is a library for manipulating fonts, written in Python."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=211c9e4671bde3881351f22a2901f692"

SRC_URI := "https://files.pythonhosted.org/packages/a4/6e/681d39b71d5f0d6a1b1dc87d7333331f9961b5ab6a2ad6372d6cf3f8b04c/fonttools-4.53.0.tar.gz"
SRC_URI[sha256sum] = "c93ed66d32de1559b6fc348838c7572d5c0ac1e4a258e76763a5caddd8944002"

inherit pypi setuptools3

DEPENDS = "python3-setuptools"
DEPENDS += "python3-setuptools-native"

PYPI_PACKAGE = "fonttools"
