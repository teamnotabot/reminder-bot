const https = require('https');

const doPostRequest = () => {

  const data = {text: 'Daily standup is in 15 minutes!'}

  return new Promise((resolve, reject) => {
    const options = {
      host: 'hooks.slack.com',
      path: '/services/TLVG4HE9W/BLS090RUZ/fTeQwqpsi3svcEva72JqV2yU',
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      }
    };

    //create the request object with the callback with the result
    const req = https.request(options, (res) => {
      resolve(JSON.stringify(res.statusCode));
    });

    // handle the possible errors
    req.on('error', (e) => {
      reject(e.message);
    });

    //do the request
    req.write(JSON.stringify(data));

    //finish the request
    req.end();
  });
};

exports.handler = async (event) => {
  await doPostRequest()
    .then(result => console.log(`Status code: ${result}`))
    .catch(err => console.error(`Error doing the request for the event: ${JSON.stringify(event)} => ${err}`));
};
