const fs = require('fs')
const inputFile = 'drivers.csv'
const outputFile = 'src/main/resources/data.SQL'

const arr = fs.readFileSync(inputFile).toString().split('\n')
const firstLineRemoved = arr.filter((item, index) => index > 0)


let sql = '';

console.log(`starting to populate ${firstLineRemoved.length} lines from ${inputFile}`);


firstLineRemoved.forEach((line) => {
    const values = `${line.replace("'", "*").split(',').join(`','`)}`
    sql += `INSERT INTO driver (Driver_Id, Driver_Ref, Driver_Number, Driver_Code, f_Name, sur_Name,DOB, nationality, URL) VALUES ('${values.trim()}');`
})


fs.writeFileSync(outputFile, sql);