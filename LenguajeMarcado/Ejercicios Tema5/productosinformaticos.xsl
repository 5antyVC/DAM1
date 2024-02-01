<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">

        <html>
            <body>
                <table border="1">
                    <tr>
                        <th>Producto</th>
                        <th>Fabricante</th>
                        <th>Precio</th>
                    </tr>
                    <xsl:for-each select="productos/productoinformatico">
                        <tr>
                            <td>
                                <xsl:value-of select="producto" />
                            </td>
                            <td>
                                <xsl:value-of select="fabricante" />
                            </td>
                            <td>
                                <xsl:value-of select="precio" />
                            </td>
                            
                        </tr>
                    </xsl:for-each>


                </table>
            </body>

        </html>
    </xsl:template>
</xsl:stylesheet>