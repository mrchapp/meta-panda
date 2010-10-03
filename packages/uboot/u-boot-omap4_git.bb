require u-boot.inc

TAG="L24.10"
SRC_URI = "git://dev.omapzoom.org/pub/scm/bootloader/u-boot.git;branch=omap_upstram;protocol=git"
SRCREV = "${TAG}"

PV="2010-09-rc1-ti-${TAG}"
PR="r0"


UBOOT_MACHINE_pandaboard = "omap4_panda_config"
UBOOT_MACHINE_sdp4430 = "omap4_sdp4430_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"
