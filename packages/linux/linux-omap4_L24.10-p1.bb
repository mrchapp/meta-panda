require linux-omap2.inc

BRANCH = "L24.10"
TAG = "ti-2.6.35-omap4-L24.10-p1"

SRCREV = "${TAG}"
SRC_URI = "git://dev.omapzoom.org/pub/scm/integration/kernel-omap4.git;branch=${BRANCH};protocol=http"

PV = "2.6.35+omap4-L24.10-p1"
PR = "r0"

COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"

S = "${WORKDIR}/git"

do_configure_prepend () {
	case ${MACHINE} in
		pandaboard)
			cp -p ${S}/arch/arm/configs/omap_4430sdp_defconfig ${WORKDIR}/defconfig
			;;
		sdp4430)
			cp -p ${S}/arch/arm/configs/omap_4430sdp_defconfig ${WORKDIR}/defconfig
			;;
	esac
}
