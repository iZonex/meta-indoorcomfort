DESCRIPTION = "Networking Configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " \
    file://waired.network \
    "
S = "${WORKDIR}"

inherit allarch systemd

SYSTEMD_SERVICE_${PN} = "waired.network"

do_install() {
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${systemd_unitdir}/network
        install -c -m 0644 ${WORKDIR}/waired.network ${D}${systemd_unitdir}/network
    fi
}