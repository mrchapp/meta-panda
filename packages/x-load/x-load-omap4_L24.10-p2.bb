require x-load.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/x-load-omap4-git/${MACHINE}"

TAG="L24.10-p2"
PV = "1.41-ti-${TAG}"
PR="r0"

SRC_URI = "git://dev.omapzoom.org/pub/scm/bootloader/x-loader.git;branch=omap4_dev;protocol=git"
SRCREV = "${TAG}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"

XLOAD_MACHINE_pandaboard="omap4430panda_config"
XLOAD_MACHINE_sdp4430="omap4430sdp_config"
