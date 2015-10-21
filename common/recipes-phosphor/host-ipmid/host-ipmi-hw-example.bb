SUMMARY = "Phosphor OpenBMC host IPMI to DBUS Example"
DESCRIPTION = "Phosphor OpenBMC host IPMI to DBUS example implementation."
PR = "r1"

RDEPENDS_${PN} += "python-subprocess"

SYSTEMD_SERVICE_${PN} = "host-ipmi-hw.service"

inherit obmc-phosphor-pydbus-service
inherit obmc-phosphor-host-ipmi-hw

S = "${WORKDIR}/git"
SRC_URI += "git://github.com/openbmc/skeleton.git;subpath=bin;destsuffix=git"
SRCREV="${AUTOREV}"

SCRIPT_NAME = "ipmi_debug.py"
INSTALL_NAME = "host-ipmi-hw"
